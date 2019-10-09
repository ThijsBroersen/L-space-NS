package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object JobPosting extends OntologyDef(
        iri = "http://schema.org/JobPosting",
        iris = Set("http://schema.org/JobPosting"),
        label = "JobPosting",
        comment = """A listing that describes a job opening in a certain organization.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val applicantLocationRequirements = lspace.ns.vocab.schema.applicantLocationRequirements.property
lazy val baseSalary = lspace.ns.vocab.schema.baseSalary.property
lazy val datePosted = lspace.ns.vocab.schema.datePosted.property
lazy val educationRequirements = lspace.ns.vocab.schema.educationRequirements.property
lazy val employmentType = lspace.ns.vocab.schema.employmentType.property
lazy val experienceRequirements = lspace.ns.vocab.schema.experienceRequirements.property
lazy val hiringOrganization = lspace.ns.vocab.schema.hiringOrganization.property
lazy val incentiveCompensation = lspace.ns.vocab.schema.incentiveCompensation.property
lazy val industry = lspace.ns.vocab.schema.industry.property
lazy val jobBenefits = lspace.ns.vocab.schema.jobBenefits.property
lazy val jobLocation = lspace.ns.vocab.schema.jobLocation.property
lazy val jobLocationType = lspace.ns.vocab.schema.jobLocationType.property
lazy val occupationalCategory = lspace.ns.vocab.schema.occupationalCategory.property
lazy val qualifications = lspace.ns.vocab.schema.qualifications.property
lazy val relevantOccupation = lspace.ns.vocab.schema.relevantOccupation.property
lazy val responsibilities = lspace.ns.vocab.schema.responsibilities.property
lazy val salaryCurrency = lspace.ns.vocab.schema.salaryCurrency.property
lazy val skills = lspace.ns.vocab.schema.skills.property
lazy val specialCommitments = lspace.ns.vocab.schema.specialCommitments.property
lazy val title = lspace.ns.vocab.schema.title.property
lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
lazy val workHours = lspace.ns.vocab.schema.workHours.property
}
override lazy val properties: List[LProperty] = List(applicantLocationRequirements, baseSalary, datePosted, educationRequirements, employmentType, experienceRequirements, hiringOrganization, incentiveCompensation, industry, jobBenefits, jobLocation, jobLocationType, occupationalCategory, qualifications, relevantOccupation, responsibilities, salaryCurrency, skills, specialCommitments, title, validThrough, workHours)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val applicantLocationRequirements = lspace.ns.vocab.schema.applicantLocationRequirements.property
lazy val baseSalary = lspace.ns.vocab.schema.baseSalary.property
lazy val datePosted = lspace.ns.vocab.schema.datePosted.property
lazy val educationRequirements = lspace.ns.vocab.schema.educationRequirements.property
lazy val employmentType = lspace.ns.vocab.schema.employmentType.property
lazy val experienceRequirements = lspace.ns.vocab.schema.experienceRequirements.property
lazy val hiringOrganization = lspace.ns.vocab.schema.hiringOrganization.property
lazy val incentiveCompensation = lspace.ns.vocab.schema.incentiveCompensation.property
lazy val industry = lspace.ns.vocab.schema.industry.property
lazy val jobBenefits = lspace.ns.vocab.schema.jobBenefits.property
lazy val jobLocation = lspace.ns.vocab.schema.jobLocation.property
lazy val jobLocationType = lspace.ns.vocab.schema.jobLocationType.property
lazy val occupationalCategory = lspace.ns.vocab.schema.occupationalCategory.property
lazy val qualifications = lspace.ns.vocab.schema.qualifications.property
lazy val relevantOccupation = lspace.ns.vocab.schema.relevantOccupation.property
lazy val responsibilities = lspace.ns.vocab.schema.responsibilities.property
lazy val salaryCurrency = lspace.ns.vocab.schema.salaryCurrency.property
lazy val skills = lspace.ns.vocab.schema.skills.property
lazy val specialCommitments = lspace.ns.vocab.schema.specialCommitments.property
lazy val title = lspace.ns.vocab.schema.title.property
lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
lazy val workHours = lspace.ns.vocab.schema.workHours.property
}
}