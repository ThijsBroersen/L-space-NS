package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object knowsLanguage extends PropertyDef(
        iri = "http://schema.org/knowsLanguage",
        iris = Set("http://schema.org/knowsLanguage"),
        label = "knowsLanguage",
        comment = """Of a <a class="localLink" href="http://schema.org/Person">Person</a>, and less typically of an <a class="localLink" href="http://schema.org/Organization">Organization</a>, to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, Language.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}