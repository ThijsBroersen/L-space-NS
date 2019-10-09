package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Distance extends OntologyDef(
        iri = "http://schema.org/Distance",
        iris = Set("http://schema.org/Distance"),
        label = "Distance",
        comment = """Properties that take Distances as values are of the form '&lt;Number&gt; &lt;Length unit of measure&gt;'. E.g., '7 ft'.""",
        `@extends` = List(Quantity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Quantity.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Quantity.Properties{

}
}