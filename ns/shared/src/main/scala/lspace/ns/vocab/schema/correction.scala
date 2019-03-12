package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object correction extends PropertyDef(
        iri = "https://schema.org/correction",
        iris = Set("https://schema.org/correction"),
        label = "correction",
        comment = """Indicates a correction to a <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>, either via a <a class="localLink" href="http://schema.org/CorrectionComment">CorrectionComment</a>, textually or in another document.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, `@url`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}