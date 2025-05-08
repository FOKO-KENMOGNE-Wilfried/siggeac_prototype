package com.project.professeurs;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.impl.*;

import com.project.config.DBConnectionManager;

import siggeac.jooq.generated.tables.Professeur;
import siggeac.jooq.generated.tables.records.ProfesseurRecord;

public class ProfesseurDAO {
    public List<ProfesseurRecord> findAll() throws Exception {

        try (Connection conn = DBConnectionManager.getConnection()) {
            DSLContext ctx = DSL.using(conn);
            return ctx.selectFrom(Professeur.PROFESSEUR).fetch();
        }
    }

    public void testProf() throws SQLException, Exception{
        try (Connection conn = DBConnectionManager.getConnection()) {
            DSLContext ctx = DSL.using(conn);
            
            // TO DO
        }
    }
}
