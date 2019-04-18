package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Mountain extends OntologyDef(
        iri = "http://schema.org/Mountain",
        iris = Set("http://schema.org/Mountain"),
        label = "Mountain",
        comment = """A mountain, like Mount Whitney or Mount Everest.""",
        `@extends` = () => List(Landform.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Landform.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Landform.Properties{

}
}