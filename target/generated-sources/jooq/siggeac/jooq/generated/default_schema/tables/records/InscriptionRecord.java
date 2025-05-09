/*
 * This file is generated by jOOQ.
 */
package siggeac.jooq.generated.default_schema.tables.records;


import org.jooq.Record4;
import org.jooq.impl.UpdatableRecordImpl;

import siggeac.jooq.generated.default_schema.tables.Inscription;


/**
 * La personne étudiante (identifiée par "matriculeE") est inscrite au groupe
 * identifié par le sigle "sigle", le numéro "noGroupe" et le trimestre
 * "trimestre".
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class InscriptionRecord extends UpdatableRecordImpl<InscriptionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>inscription.matriculee</code>.
     */
    public void setMatriculee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>inscription.matriculee</code>.
     */
    public String getMatriculee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>inscription.sigle</code>.
     */
    public void setSigle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>inscription.sigle</code>.
     */
    public String getSigle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>inscription.trimestre</code>.
     */
    public void setTrimestre(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>inscription.trimestre</code>.
     */
    public String getTrimestre() {
        return (String) get(2);
    }

    /**
     * Setter for <code>inscription.nogroupe</code>.
     */
    public void setNogroupe(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>inscription.nogroupe</code>.
     */
    public String getNogroupe() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InscriptionRecord
     */
    public InscriptionRecord() {
        super(Inscription.INSCRIPTION);
    }

    /**
     * Create a detached, initialised InscriptionRecord
     */
    public InscriptionRecord(String matriculee, String sigle, String trimestre, String nogroupe) {
        super(Inscription.INSCRIPTION);

        setMatriculee(matriculee);
        setSigle(sigle);
        setTrimestre(trimestre);
        setNogroupe(nogroupe);
        resetTouchedOnNotNull();
    }
}
