/*
 * This file is generated by jOOQ.
 */
package siggeac.jooq.generated.default_schema;


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
 * Convenience access to all tables in the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables {

    /**
     * La personne enseignante (identifiée par "matriculeP") assure la formation
     * du groupe identifié par les  sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre". 
     */
    public static final Affectation AFFECTATION = Affectation.AFFECTATION;

    /**
     * La personne enseignante (identifiée par "matriculeP") a la compétence
     * requise pour assure le cours (identifié par le sigle "sigle"). 
     */
    public static final Competence COMPETENCE = Competence.COMPETENCE;

    /**
     * Le cours (identifié par le sigle "sigle") est défini dans le répertoire
     * des cours offerts par l’Université. Il a pour titre "titre". Il comporte
     * "credit" crédit(s). 
     */
    public static final Cours COURS = Cours.COURS;

    /**
     * La personne enseignante (identifiée par "matriculeP") est disponible pour
     * enseigner durant le trimestre "trimestre". 
     */
    public static final Disponibilite DISPONIBILITE = Disponibilite.DISPONIBILITE;

    /**
     * La personne étudiante (identifiée par le matricule "matriculeE") possède
     * un dossier à l’Université. Son nom est "nom". Sa date de naissance est
     * "ddn". 
     */
    public static final Etudiant ETUDIANT = Etudiant.ETUDIANT;

    /**
     * La personne étudiante (identifiée par "matriculeE") inscrite au groupe
     * identifié par sigle "sigle", le numéro "noGroupe" et le trimestre
     * "trimestre" a obtenu la note "note". 
     */
    public static final Evaluation EVALUATION = Evaluation.EVALUATION;

    /**
     * Le groupe (identifié par le sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre") est constitué. 
     */
    public static final Groupe GROUPE = Groupe.GROUPE;

    /**
     * La personne étudiante (identifiée par "matriculeE") est inscrite au
     * groupe identifié par le sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre".
     */
    public static final Inscription INSCRIPTION = Inscription.INSCRIPTION;

    /**
     * l’Université s’engage à offrir le cours "sigle" au trimestre
     * "trimestre". 
     */
    public static final Offre OFFRE = Offre.OFFRE;

    /**
     * L’inscription au cours "sigle" n’est autorisée qu’aux personnes qui
     * auront réussi le cours "siglePréalable" avant le début du cours "sigle". 
     */
    public static final Prealable PREALABLE = Prealable.PREALABLE;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP")
     * possède un dossier à l’Université. Une personne enseignante est une
     * professeure, un professeur, une chargée de cours ou un chargé de cours.
     * Son nom est "nom". 
     */
    public static final Professeur PROFESSEUR = Professeur.PROFESSEUR;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP") n’a
     * pas de bureau pour la raison "cause". 
     */
    public static final ProfesseurBureauAbs PROFESSEUR_BUREAU_ABS = ProfesseurBureauAbs.PROFESSEUR_BUREAU_ABS;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP") a un
     * bureau et ce bureau est le "bureau". 
     */
    public static final ProfesseurBureauPre PROFESSEUR_BUREAU_PRE = ProfesseurBureauPre.PROFESSEUR_BUREAU_PRE;
}
