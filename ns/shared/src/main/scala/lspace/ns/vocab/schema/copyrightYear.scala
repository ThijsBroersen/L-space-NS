package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object copyrightYear extends PropertyDef(
        iri = "https://schema.org/copyrightYear",
        iris = Set("https://schema.org/copyrightYear"),
        label = "copyrightYear",
        comment = """The year during which the claimed copyright for the CreativeWork was first asserted.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}