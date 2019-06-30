package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Vehicle extends OntologyDef(
        iri = "http://schema.org/Vehicle",
        iris = Set("http://schema.org/Vehicle"),
        label = "Vehicle",
        comment = """A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.""",
        `@extends` = () => List(Product.ontology)
       ){
}