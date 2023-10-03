/*
* la "auditoría" se refiere al proceso de registrar y hacer un seguimiento de
* ciertas acciones o eventos dentro de una aplicación. La auditoría se utiliza
* para rastrear quién realiza determinadas operaciones, cuándo se realizaron
*  y qué se hizo. Esto es importante en muchas aplicaciones, especialmente en aquellas
* que gestionan datos sensibles o críticos, ya que permite el seguimiento y la supervisión
*  de las actividades realizadas por usuarios o sistemas.
* */



package com.progVideosSQ.videos.entities.audit;

import com.progVideosSQ.videos.config.CustomRevisionListener;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.CustomEntityDirtinessStrategy;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Data
public class Revision implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(
            name="revision_seq",
            sequenceName="rbac,seq_revision_id"
    )
    @RevisionNumber
    private int id;
    @Column(name="REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
