/*
 * This file is generated by jOOQ.
 */
package siggeac.jooq.generated.default_schema;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Domain;
import org.jooq.Table;
import org.jooq.impl.DSL;
import org.jooq.impl.SchemaImpl;

import siggeac.jooq.generated.DefaultCatalog;
import siggeac.jooq.generated.default_schema.tables.Affectation;
import siggeac.jooq.generated.default_schema.tables.Competence;
import siggeac.jooq.generated.default_schema.tables.Cours;
import siggeac.jooq.generated.default_schema.tables.Disponibilite;
import siggeac.jooq.generated.default_schema.tables.Etudiant;
import siggeac.jooq.generated.default_schema.tables.Evaluation;
import siggeac.jooq.generated.default_schema.tables.Groupe;
import siggeac.jooq.generated.default_schema.tables.Inscription;
import siggeac.jooq.generated.default_schema.tables.Offre;
import siggeac.jooq.generated.default_schema.tables.Prealable;
import siggeac.jooq.generated.default_schema.tables.Professeur;
import siggeac.jooq.generated.default_schema.tables.ProfesseurBureauAbs;
import siggeac.jooq.generated.default_schema.tables.ProfesseurBureauPre;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * La personne enseignante (identifiée par "matriculeP") assure la formation
     * du groupe identifié par les  sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre". 
     */
    public final Affectation AFFECTATION = Affectation.AFFECTATION;

    /**
     * La personne enseignante (identifiée par "matriculeP") a la compétence
     * requise pour assure le cours (identifié par le sigle "sigle"). 
     */
    public final Competence COMPETENCE = Competence.COMPETENCE;

    /**
     * Le cours (identifié par le sigle "sigle") est défini dans le répertoire
     * des cours offerts par l’Université. Il a pour titre "titre". Il comporte
     * "credit" crédit(s). 
     */
    public final Cours COURS = Cours.COURS;

    /**
     * La personne enseignante (identifiée par "matriculeP") est disponible pour
     * enseigner durant le trimestre "trimestre". 
     */
    public final Disponibilite DISPONIBILITE = Disponibilite.DISPONIBILITE;

    /**
     * La personne étudiante (identifiée par le matricule "matriculeE") possède
     * un dossier à l’Université. Son nom est "nom". Sa date de naissance est
     * "ddn". 
     */
    public final Etudiant ETUDIANT = Etudiant.ETUDIANT;

    /**
     * La personne étudiante (identifiée par "matriculeE") inscrite au groupe
     * identifié par sigle "sigle", le numéro "noGroupe" et le trimestre
     * "trimestre" a obtenu la note "note". 
     */
    public final Evaluation EVALUATION = Evaluation.EVALUATION;

    /**
     * Le groupe (identifié par le sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre") est constitué. 
     */
    public final Groupe GROUPE = Groupe.GROUPE;

    /**
     * La personne étudiante (identifiée par "matriculeE") est inscrite au
     * groupe identifié par le sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre".
     */
    public final Inscription INSCRIPTION = Inscription.INSCRIPTION;

    /**
     * l’Université s’engage à offrir le cours "sigle" au trimestre
     * "trimestre". 
     */
    public final Offre OFFRE = Offre.OFFRE;

    /**
     * L’inscription au cours "sigle" n’est autorisée qu’aux personnes qui
     * auront réussi le cours "siglePréalable" avant le début du cours "sigle". 
     */
    public final Prealable PREALABLE = Prealable.PREALABLE;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP")
     * possède un dossier à l’Université. Une personne enseignante est une
     * professeure, un professeur, une chargée de cours ou un chargé de cours.
     * Son nom est "nom". 
     */
    public final Professeur PROFESSEUR = Professeur.PROFESSEUR;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP") n’a
     * pas de bureau pour la raison "cause". 
     */
    public final ProfesseurBureauAbs PROFESSEUR_BUREAU_ABS = ProfesseurBureauAbs.PROFESSEUR_BUREAU_ABS;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP") a un
     * bureau et ce bureau est le "bureau". 
     */
    public final ProfesseurBureauPre PROFESSEUR_BUREAU_PRE = ProfesseurBureauPre.PROFESSEUR_BUREAU_PRE;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super(DSL.name(""), null, DSL.comment(""));
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Domain<?>> getDomains() {
        return Arrays.asList(
            Domains.BUREAU,
            Domains.CAUSE,
            Domains.CDC,
            Domains.MATRICULEE,
            Domains.MATRICULEP,
            Domains.NOGROUPE,
            Domains.NOM,
            Domains.NOTE,
            Domains.SIGLE,
            Domains.TITRE,
            Domains.TRIMESTRE
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Affectation.AFFECTATION,
            Competence.COMPETENCE,
            Cours.COURS,
            Disponibilite.DISPONIBILITE,
            Etudiant.ETUDIANT,
            Evaluation.EVALUATION,
            Groupe.GROUPE,
            Inscription.INSCRIPTION,
            Offre.OFFRE,
            Prealable.PREALABLE,
            Professeur.PROFESSEUR,
            ProfesseurBureauAbs.PROFESSEUR_BUREAU_ABS,
            ProfesseurBureauPre.PROFESSEUR_BUREAU_PRE
        );
    }
}
