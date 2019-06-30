package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableLanguage extends PropertyDef(
        iri = "http://schema.org/availableLanguage",
        iris = Set("http://schema.org/availableLanguage"),
        label = "availableLanguage",
        comment = """A language someone may use with or at the item, service or place. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/inLanguage">inLanguage</a>""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, Language.ontology)
       ){
}