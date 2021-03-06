package ru.fullrest.mfr.server.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "Updates")
public class Update {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UpdateId")
    private int id;

    @Column(name = "Version", nullable = false)
    private String version;

    @Column(name = "UploadDate", nullable = false)
    private LocalDateTime uploadDate = LocalDateTime.now();

    @Column(name = "Active")
    private boolean active = true;

    @Column(name = "Path")
    private String path;
}
