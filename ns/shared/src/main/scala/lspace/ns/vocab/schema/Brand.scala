package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Brand extends OntologyDef(
        iri = "http://schema.org/Brand",
        iris = Set("http://schema.org/Brand"),
        label = "Brand",
        comment = """A brand is a name used by an organization or business person for labeling a product, product group, or similar.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}