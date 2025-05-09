/*
 * This file is generated by jOOQ.
 */
package siggeac.jooq.generated.default_schema.routines;


import java.time.LocalDate;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;

import siggeac.jooq.generated.default_schema.DefaultSchema;
import siggeac.jooq.generated.default_schema.Domains;


/**
 * Modifie le nom ou la date de naissance d'un étudiant.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ModifierEtudiant extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>modifier_etudiant.p_matriculee</code>.
     */
    public static final Parameter<String> P_MATRICULEE = Internal.createParameter("p_matriculee", Domains.MATRICULEE.getDataType(), false, false);

    /**
     * The parameter <code>modifier_etudiant.p_nom</code>.
     */
    public static final Parameter<String> P_NOM = Internal.createParameter("p_nom", Domains.NOM.getDataType().defaultValue(DSL.field(DSL.raw("NULL::text"), Domains.NOM.getDataType())), true, false);

    /**
     * The parameter <code>modifier_etudiant.p_ddn</code>.
     */
    public static final Parameter<LocalDate> P_DDN = Internal.createParameter("p_ddn", SQLDataType.LOCALDATE.defaultValue(DSL.field(DSL.raw("NULL::date"), SQLDataType.LOCALDATE)), true, false);

    /**
     * Create a new routine call instance
     */
    public ModifierEtudiant() {
        super("modifier_etudiant", DefaultSchema.DEFAULT_SCHEMA, DSL.comment("Modifie le nom ou la date de naissance d'un étudiant."));

        addInParameter(P_MATRICULEE);
        addInParameter(P_NOM);
        addInParameter(P_DDN);
        setSQLUsable(false);
    }

    /**
     * Set the <code>p_matriculee</code> parameter IN value to the routine
     */
    public void setPMatriculee(String value) {
        setValue(P_MATRICULEE, value);
    }

    /**
     * Set the <code>p_nom</code> parameter IN value to the routine
     */
    public void setPNom(String value) {
        setValue(P_NOM, value);
    }

    /**
     * Set the <code>p_ddn</code> parameter IN value to the routine
     */
    public void setPDdn(LocalDate value) {
        setValue(P_DDN, value);
    }
}
