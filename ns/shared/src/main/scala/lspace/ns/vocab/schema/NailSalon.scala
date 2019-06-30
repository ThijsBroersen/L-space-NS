package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NailSalon extends OntologyDef(
        iri = "http://schema.org/NailSalon",
        iris = Set("http://schema.org/NailSalon"),
        label = "NailSalon",
        comment = """A nail salon.""",
        `@extends` = () => List(HealthAndBeautyBusiness.ontology)
       ){
}