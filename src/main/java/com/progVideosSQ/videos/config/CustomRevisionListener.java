package com.progVideosSQ.videos.config;

import com.progVideosSQ.videos.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {//crea una revision por cada consulta
    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }

}
