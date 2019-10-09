package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object mealService extends PropertyDef(
        iri = "http://schema.org/mealService",
        iris = Set("http://schema.org/mealService"),
        label = "mealService",
        comment = """Description of the meals that will be provided or available for purchase.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}