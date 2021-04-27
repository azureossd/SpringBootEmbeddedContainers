package com.embeddedcontainer.jetty.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "todo")
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Equivalient of Not Null + Not Empty
    @NotEmpty(message = "Value must be not null and not empty")
    // Min/max length of 2-455 characters
    @Size(min = 2, max = 455, message = "Todo task must be between 2 and 455 characters long")
    private String name;
    @NotNull(message = "Value must either be true or false")
    private Boolean completed;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
