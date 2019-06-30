package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object copyrightYear extends PropertyDef(
        iri = "http://schema.org/copyrightYear",
        iris = Set("http://schema.org/copyrightYear"),
        label = "copyrightYear",
        comment = """The year during which the claimed copyright for the CreativeWork was first asserted.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology)
       ){
}