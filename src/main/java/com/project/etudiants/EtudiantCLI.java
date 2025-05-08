package com.project.etudiants;

import java.util.List;

import com.project.core.Permission;
import com.project.core.Role;
import com.project.core.SecurityManager;

import siggeac.jooq.generated.tables.records.EtudiantsRecord;

public class EtudiantCLI {

    public static void menu() {
        if (!SecurityManager.userCan(Role.CONSULTATION, Permission.ETUDIANTS)) {
            System.out.println("Acces denied !");
            return;
        }
        try {
            EtudiantService service = new EtudiantService();
            List<EtudiantsRecord> liste = service.listerEtudiants();
            System.out.println("Students list: ");
            for (EtudiantsRecord e : liste) {
                System.out.printf("[%d] %s %s (%s)\n",
                        e.getId(),
                        e.getPrenom(),
                        e.getNom(),
                        e.getMatricule());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
