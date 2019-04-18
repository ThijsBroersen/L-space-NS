package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object acrissCode extends PropertyDef(
        iri = "http://schema.org/acrissCode",
        iris = Set("http://schema.org/acrissCode"),
        label = "acrissCode",
        comment = """The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}