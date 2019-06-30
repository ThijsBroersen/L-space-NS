package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subtitleLanguage extends PropertyDef(
        iri = "http://schema.org/subtitleLanguage",
        iris = Set("http://schema.org/subtitleLanguage"),
        label = "subtitleLanguage",
        comment = """Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, Language.ontology)
       ){
}