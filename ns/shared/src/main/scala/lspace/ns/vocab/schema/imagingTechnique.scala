package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object imagingTechnique extends PropertyDef(
        iri = "http://schema.org/imagingTechnique",
        iris = Set("http://schema.org/imagingTechnique"),
        label = "imagingTechnique",
        comment = """Imaging technique used.""",
        `@extends` = List(),
        `@range` = List(MedicalImagingTechnique.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}