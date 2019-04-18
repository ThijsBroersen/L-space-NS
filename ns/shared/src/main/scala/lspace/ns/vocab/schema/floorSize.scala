package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object floorSize extends PropertyDef(
        iri = "http://schema.org/floorSize",
        iris = Set("http://schema.org/floorSize"),
        label = "floorSize",
        comment = """The size of the accommodation, e.g. in square meter or squarefoot.
Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}