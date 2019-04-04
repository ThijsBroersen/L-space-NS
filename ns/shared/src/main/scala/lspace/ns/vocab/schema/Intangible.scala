package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property, OntologyDef}
object Intangible extends OntologyDef(
        iri = "https://schema.org/Intangible",
        iris = Set("https://schema.org/Intangible"),
        label = "Intangible",
        comment = """A utility class that serves as the umbrella for a number of 'intangible' things such as quantities, structured values, etc.""",
        `@extends` = () => List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{
}
override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{
}
}