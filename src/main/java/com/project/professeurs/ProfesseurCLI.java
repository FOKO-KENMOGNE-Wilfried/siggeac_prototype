package com.project.professeurs;

import java.util.List;


import com.project.core.Permission;
import com.project.core.Role;
import com.project.core.SecurityManager;

import siggeac.jooq.generated.tables.records.ProfesseurRecord;

public class ProfesseurCLI {
    public static void menu() {
        if (!SecurityManager.userCan(Role.CONSULTATION, Permission.PROFESSEURS)) {
            System.out.println("Acces denied !");
            return;
        }
        try {
            ProfesseurService service = new ProfesseurService();
            List<ProfesseurRecord> liste = service.listerProfesseurs();
            System.out.println("Students list: ");
            for (ProfesseurRecord e : liste) {
                System.out.printf("[%d] %s %s (%s)\n",
                        e.getMatriculep(),
                        e.getNom());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
