package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object correction extends PropertyDef(
        iri = "http://schema.org/correction",
        iris = Set("http://schema.org/correction"),
        label = "correction",
        comment = """Indicates a correction to a <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>, either via a <a class="localLink" href="http://schema.org/CorrectionComment">CorrectionComment</a>, textually or in another document.""",
        `@extends` = () => List(),
        `@range` = () => List(CorrectionComment.ontology, Text.ontology, URL.ontology)
       ){
}