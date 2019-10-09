package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Occupation extends OntologyDef(
        iri = "http://schema.org/Occupation",
        iris = Set("http://schema.org/Occupation"),
        label = "Occupation",
        comment = """A profession, may involve prolonged training and/or a formal qualification.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val educationRequirements = lspace.ns.vocab.schema.educationRequirements.property
lazy val estimatedSalary = lspace.ns.vocab.schema.estimatedSalary.property
lazy val experienceRequirements = lspace.ns.vocab.schema.experienceRequirements.property
lazy val occupationLocation = lspace.ns.vocab.schema.occupationLocation.property
lazy val occupationalCategory = lspace.ns.vocab.schema.occupationalCategory.property
lazy val qualifications = lspace.ns.vocab.schema.qualifications.property
lazy val responsibilities = lspace.ns.vocab.schema.responsibilities.property
lazy val skills = lspace.ns.vocab.schema.skills.property
}
override lazy val properties: List[LProperty] = List(educationRequirements, estimatedSalary, experienceRequirements, occupationLocation, occupationalCategory, qualifications, responsibilities, skills)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val educationRequirements = lspace.ns.vocab.schema.educationRequirements.property
lazy val estimatedSalary = lspace.ns.vocab.schema.estimatedSalary.property
lazy val experienceRequirements = lspace.ns.vocab.schema.experienceRequirements.property
lazy val occupationLocation = lspace.ns.vocab.schema.occupationLocation.property
lazy val occupationalCategory = lspace.ns.vocab.schema.occupationalCategory.property
lazy val qualifications = lspace.ns.vocab.schema.qualifications.property
lazy val responsibilities = lspace.ns.vocab.schema.responsibilities.property
lazy val skills = lspace.ns.vocab.schema.skills.property
}
}