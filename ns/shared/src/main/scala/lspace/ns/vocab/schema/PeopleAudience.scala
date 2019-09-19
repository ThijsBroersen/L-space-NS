package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PeopleAudience extends OntologyDef(
        iri = "http://schema.org/PeopleAudience",
        iris = Set("http://schema.org/PeopleAudience"),
        label = "PeopleAudience",
        comment = """A set of characteristics belonging to people, e.g. who compose an item's target audience.""",
        `@extends` = () => List(Audience.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Audience.Properties{
lazy val healthCondition = lspace.ns.vocab.schema.healthCondition.property
lazy val requiredGender = lspace.ns.vocab.schema.requiredGender.property
lazy val requiredMaxAge = lspace.ns.vocab.schema.requiredMaxAge.property
lazy val requiredMinAge = lspace.ns.vocab.schema.requiredMinAge.property
lazy val suggestedGender = lspace.ns.vocab.schema.suggestedGender.property
lazy val suggestedMaxAge = lspace.ns.vocab.schema.suggestedMaxAge.property
lazy val suggestedMinAge = lspace.ns.vocab.schema.suggestedMinAge.property
}
override lazy val properties: List[LProperty] = List(healthCondition, requiredGender, requiredMaxAge, requiredMinAge, suggestedGender, suggestedMaxAge, suggestedMinAge)
trait Properties extends lspace.ns.vocab.schema.Audience.Properties{
lazy val healthCondition = lspace.ns.vocab.schema.healthCondition.property
lazy val requiredGender = lspace.ns.vocab.schema.requiredGender.property
lazy val requiredMaxAge = lspace.ns.vocab.schema.requiredMaxAge.property
lazy val requiredMinAge = lspace.ns.vocab.schema.requiredMinAge.property
lazy val suggestedGender = lspace.ns.vocab.schema.suggestedGender.property
lazy val suggestedMaxAge = lspace.ns.vocab.schema.suggestedMaxAge.property
lazy val suggestedMinAge = lspace.ns.vocab.schema.suggestedMinAge.property
}
}