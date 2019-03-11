package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object mainEntityOfPage extends PropertyDef(
        iri = "https://schema.org/mainEntityOfPage",
        iris = Set("https://schema.org/mainEntityOfPage"),
        label = "mainEntityOfPage",
        comment = """Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See <a href="/docs/datamodel.html#mainEntityBackground">background notes</a> for details.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}