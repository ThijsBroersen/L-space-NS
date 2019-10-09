package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object proficiencyLevel extends PropertyDef(
        iri = "http://schema.org/proficiencyLevel",
        iris = Set("http://schema.org/proficiencyLevel"),
        label = "proficiencyLevel",
        comment = """Proficiency needed for this content; expected values: 'Beginner', 'Expert'.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}