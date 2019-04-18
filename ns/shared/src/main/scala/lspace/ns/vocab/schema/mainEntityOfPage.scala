package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object mainEntityOfPage extends PropertyDef(
        iri = "http://schema.org/mainEntityOfPage",
        iris = Set("http://schema.org/mainEntityOfPage"),
        label = "mainEntityOfPage",
        comment = """Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See <a href="/docs/datamodel.html#mainEntityBackground">background notes</a> for details.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology, URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}