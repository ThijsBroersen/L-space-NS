package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object sdDatePublished extends PropertyDef(
        iri = "https://schema.org/sdDatePublished",
        iris = Set("https://schema.org/sdDatePublished"),
        label = "sdDatePublished",
        comment = """Indicates the date on which the current structured data was generated / published. Typically used alongside <a class="localLink" href="http://schema.org/sdPublisher">sdPublisher</a>""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}