package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HousePainter extends OntologyDef(
        iri = "http://schema.org/HousePainter",
        iris = Set("http://schema.org/HousePainter"),
        label = "HousePainter",
        comment = """A house painting service.""",
        `@extends` = () => List(HomeAndConstructionBusiness.ontology)
       ){
}