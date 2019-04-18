package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MoveAction
    extends OntologyDef(
      iri = "http://schema.org/MoveAction",
      iris = Set("http://schema.org/MoveAction"),
      label = "MoveAction",
      comment =
        """The act of an agent relocating to a place.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/TransferAction">TransferAction</a>: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object.</li>
</ul>
""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {
    lazy val fromLocation = lspace.ns.vocab.schema.fromLocation.property
    lazy val toLocation   = lspace.ns.vocab.schema.toLocation.property
  }
  override lazy val properties: List[Property] = List(fromLocation, toLocation)
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {
    lazy val fromLocation = lspace.ns.vocab.schema.fromLocation.property
    lazy val toLocation   = lspace.ns.vocab.schema.toLocation.property
  }
}
