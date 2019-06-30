package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DryCleaningOrLaundry extends OntologyDef(
        iri = "http://schema.org/DryCleaningOrLaundry",
        iris = Set("http://schema.org/DryCleaningOrLaundry"),
        label = "DryCleaningOrLaundry",
        comment = """A dry-cleaning business.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}