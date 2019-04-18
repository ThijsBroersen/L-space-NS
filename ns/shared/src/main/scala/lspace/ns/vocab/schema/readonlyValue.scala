package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object readonlyValue extends PropertyDef(
        iri = "http://schema.org/readonlyValue",
        iris = Set("http://schema.org/readonlyValue"),
        label = "readonlyValue",
        comment = """Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.""",
        `@extends` = () => List(),
        `@range` = () => List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}