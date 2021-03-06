package com.backend.backend.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Notifications")

public class Notification {

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Id
    private ObjectId id = new ObjectId();

    @NotBlank
    public String petId;
    @NotBlank
    public String needId;
    @NotBlank
    public String scheduleId;
    @NotBlank
    public String userId;
    @NotBlank
    public String assignedUserId;
    @NotBlank
    Boolean checked;
    @NotBlank
    LocalDate date; 

    public Notification(@NotBlank String petId, String needId, String scheduleId, String userId, String assignedUserId, Boolean checked, LocalDate date) {
        ObjectId id;
        this.petId = petId;
        this.needId = needId;
        this.scheduleId = scheduleId;
        this.userId = userId;
        this.assignedUserId = assignedUserId;
        this.checked = checked; 
        this.date = date; 
    }

    public String getId() {
        return id.toHexString();
    }

    public String getPetId() {
        return petId;
    }

    public String getScheduleId() {
        return scheduleId;
    }
    public String getUserId() {
        return userId; 
    }
    public String getAssignedUserId() {
        return assignedUserId;
    }

    public String getNeedId() {
        return needId;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
    public LocalDate getDate() {
        return date; 
    }
}
