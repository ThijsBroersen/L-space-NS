package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GatedResidenceCommunity extends OntologyDef(
        iri = "http://schema.org/GatedResidenceCommunity",
        iris = Set("http://schema.org/GatedResidenceCommunity"),
        label = "GatedResidenceCommunity",
        comment = """Residence type: Gated community.""",
        `@extends` = () => List(Residence.ontology)
       ){
}