package com.project.etudiants;

import java.util.List;

import com.project.core.Permission;
import com.project.core.Role;
import com.project.core.SecurityManager;

import siggeac.jooq.generated.default_schema.tables.records.EtudiantRecord;

public class EtudiantCLI {

    public static void menu() {
        if (!SecurityManager.userCan(Role.CONSULTATION, Permission.ETUDIANTS)) {
            System.out.println("Acces denied !");
            return;
        }
        try {
            EtudiantService service = new EtudiantService();
            List<EtudiantRecord> liste = service.listerEtudiants();
            System.out.println("Students list: ");
            for (EtudiantRecord e : liste) {
                System.out.printf("[%d] %s %s (%s)\n",
                        e.getMatriculee(),
                        e.getNom());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
