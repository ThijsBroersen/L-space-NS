package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object gameTip extends PropertyDef(
        iri = "http://schema.org/gameTip",
        iris = Set("http://schema.org/gameTip"),
        label = "gameTip",
        comment = """Links to tips, tactics, etc.""",
        `@extends` = List(),
        `@range` = List(CreativeWork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}