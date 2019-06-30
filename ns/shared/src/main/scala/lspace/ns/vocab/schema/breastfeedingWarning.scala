package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object breastfeedingWarning extends PropertyDef(
        iri = "http://schema.org/breastfeedingWarning",
        iris = Set("http://schema.org/breastfeedingWarning"),
        label = "breastfeedingWarning",
        comment = """Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}