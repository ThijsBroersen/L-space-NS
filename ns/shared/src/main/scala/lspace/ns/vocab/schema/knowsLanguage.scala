package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object knowsLanguage extends PropertyDef(
        iri = "https://schema.org/knowsLanguage",
        iris = Set("https://schema.org/knowsLanguage"),
        label = "knowsLanguage",
        comment = """Of a <a class="localLink" href="http://schema.org/Person">Person</a>, and less typically of an <a class="localLink" href="http://schema.org/Organization">Organization</a>, to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}