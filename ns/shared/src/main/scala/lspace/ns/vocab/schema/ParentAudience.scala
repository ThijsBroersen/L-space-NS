package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ParentAudience extends OntologyDef(
        iri = "http://schema.org/ParentAudience",
        iris = Set("http://schema.org/ParentAudience"),
        label = "ParentAudience",
        comment = """A set of characteristics describing parents, who can be interested in viewing some content.""",
        `@extends` = List(PeopleAudience.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PeopleAudience.Properties{
lazy val childMaxAge = lspace.ns.vocab.schema.childMaxAge.property
lazy val childMinAge = lspace.ns.vocab.schema.childMinAge.property
}
override lazy val properties: List[LProperty] = List(childMaxAge, childMinAge)
trait Properties extends lspace.ns.vocab.schema.PeopleAudience.Properties{
lazy val childMaxAge = lspace.ns.vocab.schema.childMaxAge.property
lazy val childMinAge = lspace.ns.vocab.schema.childMinAge.property
}
}