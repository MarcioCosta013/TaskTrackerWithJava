package classes;

import java.time.LocalDate;

public class TaskObj {

    private Long id;
    private String description;
    private String status;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public TaskObj(String description, String status, LocalDate createdAt, LocalDate updateAt) {

        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    public String toJson() {
        return String.format(
                "{\"id\":\"%s\",\"description\":\"%s\",\"status\":\"%s\",\"dataCriacao\":\"%s\",\"dataUltimaAlteracao\":\"%s\"}",
                id, description, status, createdAt, updateAt);
    }

    @Override
    public String toString() {
        return "TaskObj [id=" + id + ", description=" + description + ", status=" + status + ", createdAt=" + createdAt
                + ", updateAt=" + updateAt + "]";
    }

    public static TaskObj fromJson(String taskson) {
        String[] parts = taskson.replaceAll("[{}\"]", "").split(",");
        Long id = null;
        String description = null, status = null;
        LocalDate createdAt = null, updateAt = null;

        for (String part : parts) {
            String[] keyValue = part.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            switch (key) {
                case "id":
                    id = Long.parseLong(value);
                    break;
                case "description":
                    description = value;
                    break;
                case "status":
                    status = value;
                    break;
                case "dataCriacao":
                    createdAt = LocalDate.parse(value);
                    break;
                case "dataUltimaAlteracao":
                    updateAt = LocalDate.parse(value);
                    break;
            }
        }
        return new TaskObj(description, status, createdAt, updateAt);
    }

}
