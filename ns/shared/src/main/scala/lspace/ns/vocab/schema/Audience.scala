package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Audience extends OntologyDef(
        iri = "http://schema.org/Audience",
        iris = Set("http://schema.org/Audience"),
        label = "Audience",
        comment = """Intended audience for an item, i.e. the group for whom the item was created.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val geographicArea = lspace.ns.vocab.schema.geographicArea.property
}
override lazy val properties: List[LProperty] = List(geographicArea)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val geographicArea = lspace.ns.vocab.schema.geographicArea.property
}
}