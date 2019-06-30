package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Mass extends OntologyDef(
        iri = "http://schema.org/Mass",
        iris = Set("http://schema.org/Mass"),
        label = "Mass",
        comment = """Properties that take Mass as values are of the form '&lt;Number&gt; &lt;Mass unit of measure&gt;'. E.g., '7 kg'.""",
        `@extends` = () => List(Quantity.ontology)
       ){
}