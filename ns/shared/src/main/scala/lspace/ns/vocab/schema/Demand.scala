package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Demand extends OntologyDef(
        iri = "http://schema.org/Demand",
        iris = Set("http://schema.org/Demand"),
        label = "Demand",
        comment = """A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}