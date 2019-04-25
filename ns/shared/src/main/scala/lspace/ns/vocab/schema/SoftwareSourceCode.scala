package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SoftwareSourceCode
    extends OntologyDef(
      iri = "http://schema.org/SoftwareSourceCode",
      iris = Set("http://schema.org/SoftwareSourceCode"),
      label = "SoftwareSourceCode",
      comment =
        """Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val runtime    = lspace.ns.vocab.schema.runtime.property
    lazy val sampleType = lspace.ns.vocab.schema.sampleType.property
  }
  override lazy val properties: List[LProperty] = List(runtime, sampleType)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val runtime    = lspace.ns.vocab.schema.runtime.property
    lazy val sampleType = lspace.ns.vocab.schema.sampleType.property
  }
}
