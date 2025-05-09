/*
 * This file is generated by jOOQ.
 */
package siggeac.jooq.generated.default_schema.routines;


import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import siggeac.jooq.generated.default_schema.DefaultSchema;
import siggeac.jooq.generated.default_schema.Domains;


/**
 * Ajoute une affectation à un professeur, en vérifiant la compétence et la
 * disponibilité.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AjouterAffectation extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ajouter_affectation.p_sigle</code>.
     */
    public static final Parameter<String> P_SIGLE = Internal.createParameter("p_sigle", Domains.SIGLE.getDataType(), false, false);

    /**
     * The parameter <code>ajouter_affectation.p_trimestre</code>.
     */
    public static final Parameter<String> P_TRIMESTRE = Internal.createParameter("p_trimestre", Domains.TRIMESTRE.getDataType(), false, false);

    /**
     * The parameter <code>ajouter_affectation.p_nogroupe</code>.
     */
    public static final Parameter<String> P_NOGROUPE = Internal.createParameter("p_nogroupe", Domains.NOGROUPE.getDataType(), false, false);

    /**
     * The parameter <code>ajouter_affectation.p_matriculep</code>.
     */
    public static final Parameter<String> P_MATRICULEP = Internal.createParameter("p_matriculep", Domains.MATRICULEP.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public AjouterAffectation() {
        super("ajouter_affectation", DefaultSchema.DEFAULT_SCHEMA, DSL.comment("Ajoute une affectation à un professeur, en vérifiant la compétence et la disponibilité."));

        addInParameter(P_SIGLE);
        addInParameter(P_TRIMESTRE);
        addInParameter(P_NOGROUPE);
        addInParameter(P_MATRICULEP);
        setSQLUsable(false);
    }

    /**
     * Set the <code>p_sigle</code> parameter IN value to the routine
     */
    public void setPSigle(String value) {
        setValue(P_SIGLE, value);
    }

    /**
     * Set the <code>p_trimestre</code> parameter IN value to the routine
     */
    public void setPTrimestre(String value) {
        setValue(P_TRIMESTRE, value);
    }

    /**
     * Set the <code>p_nogroupe</code> parameter IN value to the routine
     */
    public void setPNogroupe(String value) {
        setValue(P_NOGROUPE, value);
    }

    /**
     * Set the <code>p_matriculep</code> parameter IN value to the routine
     */
    public void setPMatriculep(String value) {
        setValue(P_MATRICULEP, value);
    }
}
