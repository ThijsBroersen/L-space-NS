package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PawnShop extends OntologyDef(
        iri = "http://schema.org/PawnShop",
        iris = Set("http://schema.org/PawnShop"),
        label = "PawnShop",
        comment = """A shop that will buy, or lend money against the security of, personal possessions.""",
        `@extends` = () => List(Store.ontology)
       ){
}