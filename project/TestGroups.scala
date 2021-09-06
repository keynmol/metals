object TestGroups {

  /**
   * The unit test groups contain two sets of classes that should be executed on separate shards
   * on CI. Best to always add to the shard that executes in less time.
   */
  val testGroups = List(
    Set("tests.RenameLspSuite", "tests.ImplementationLspSuite",
      "tests.worksheets.WorksheetLspSuite",
      "tests.RangeFormattingWhenPastingSuite", "tests.ScalaToplevelSuite",
      "tests.DebugProtocolSuite", "tests.BillLspSuite",
      "tests.CodeLensLspSuite", "tests.codeactions.ImportMissingSymbolLspSuite",
      "tests.debug.StepDapSuite", "tests.debug.StackFrameDapSuite",
      "tests.FormattingLspSuite", "tests.NewFileLspSuite",
      "tests.CascadeLspSuite", "tests.DiagnosticsLspSuite",
      "tests.worksheets.WorksheetNoDecorationsLspSuite",
      "tests.CompletionLspSuite", "tests.TreeViewLspSuite",
      "tests.HoverLspSuite", "tests.SuperHierarchyLspSuite",
      "tests.DidFocusLspSuite", "tests.BuildServerConnectionLspSuite",
      "tests.BuildTargetsLspSuite", "tests.FileWatcherLspSuite",
      "tests.CurrentProjectCompileLspSuite",
      "tests.remotels.RemoteLanguageServerLspSuite",
      "tests.WindowStateDidChangeLspSuite", "tests.DocumentSymbolLspSuite",
      "tests.WorkspaceSymbolExpectSuite", "tests.digest.DigestsSuite",
      "tests.MtagsSuite", "tests.ChosenBuildServerSuite",
      "tests.SemanticdbSuite", "tests.digest.MillDigestSuite",
      "tests.DocumentSymbolSuite", "tests.FoldingRangeSuite",
      "tests.pants.PantsSuite", "tests.JavadocSuite",
      "tests.MtagsEnrichmentsSuite", "tests.FuzzySuite",
      "tests.CreateDirectoriesSuite", "tests.SbtOptsSuite",
      "tests.LineListenerSuite", "tests.debug.MessageIdAdapterSuite",
      "tests.MetalsEnrichmentsSuite", "tests.DefinitionDirectorySuite",
      "tests.SuperMethodSuite", "tests.StatusBarSuite",
      "tests.CompressionSuite", "tests.OpenBrowserSuite",
      "tests.FilenameLength", "tests.PrettyPrintTreeSuite",
      "tests.decorations.SyntheticDecorationsLspSuite",
      "tests.codeactions.BracesParensLspSuite"),
    Set("tests.AmmoniteSuite", "tests.debug.BreakpointDapSuite",
      "tests.OnTypeFormattingSuite", "tests.ReferenceLspSuite",
      "tests.SuperMethodLspSuite", "tests.SyntaxErrorLspSuite",
      "tests.codeactions.StringActionsLspSuite", "tests.RangeFormattingSuite",
      "tests.CodeLensesLspSuite", "tests.DefinitionLspSuite",
      "tests.RelatedSuite", "tests.DocumentHighlightLspSuite",
      "tests.NewProjectLspSuite",
      "tests.codeactions.ImplementAbstractMembersLspSuite",
      "tests.WorkspaceSymbolLspSuite",
      "tests.RangeFormattingWhenSelectingSuite", "tests.AddPackageLspSuite",
      "tests.WarningsLspSuite", "tests.BspSwitchLspSuite",
      "tests.codeactions.CreateNewSymbolLspSuite",
      "tests.UnsupportedDebuggingLspSuite", "tests.CompilersLspSuite",
      "tests.QuickBuildSuite", "tests.StatusBarLspSuite",
      "tests.CancelCompileLspSuite", "tests.FoldingRangeLspSuite",
      "tests.DefinitionSuite", "tests.DismissedNotificationsSuite",
      "tests.JarTopLevelsSuite", "tests.DependencySourcesSuite",
      "tests.ChosenBuildToolSuite", "tests.ToplevelSuite",
      "tests.JdkSourcesSuite", "tests.digest.SbtDigestSuite",
      "tests.digest.MavenDigestSuite", "tests.UserConfigurationSuite",
      "tests.digest.GradleDigestSuite", "tests.DetectionSuite",
      "tests.digest.PantsDigestSuite", "tests.NewFileTemplateSuite",
      "tests.ScalaVersionsSuite", "tests.HttpServerSuite",
      "tests.BatchedFunctionSuite", "tests.SbtVersionSuite",
      "tests.MessagesSuite", "tests.pants.PantsGlobsSuite",
      "tests.SelectBspServerSuite", "tests.InverseDependenciesSuite",
      "tests.pantsbuild.PantsProjectNameSuite", "tests.TrigramSubstringsSuite",
      "tests.TimerSuite", "tests.FoldingRangesSuite",
      "tests.rangeFormatting.MultilineStringRangeFormattingWhenPastingSuite",
      "tests.codeactions.PatternMatchRefactorLspSuite",
      "tests.ScalaToplevelLibrarySuite",
      "tests.decorations.SyntheticHoverLspSuite",
      "tests.rangeFormatting.MultilineStringRangeFormattingWhenSelectingSuite",
      "tests.rangeFormatting.IndentWhenPastingSuite",
      "tests.DebugDiscoverySuite", "tests.SemanticdbScala2Suite",
      "tests.SelectionRangeLspSuite",
      "tests.codeactions.OrganizeImportsLspSuite",
      "tests.codeactions.InsertInferredTypeLspSuite",
      "tests.FoldingRangeScala2Suite", "tests.SystemProcessSuite",
      "tests.formatting.OnTypeFormattingSuite", "tests.DefinitionScala3Suite",
      "tests.AnsiFilterSuite", "tests.DocumentSymbolScala3Suite",
      "tests.ClassBreakpointSuite", "tests.FoldingRangeScala3Suite",
      "tests.ScalafmtConfigSuite", "tests.DocumentSymbolScala2Suite",
      "tests.StacktraceParseSuite", "tests.WorksheetDependencySourcesSuite",
      "tests.DefinitionScala2Suite", "tests.AnalyzeStacktraceLspSuite",
      "tests.codeactions.ExtractRenameMemberLspSuite",
      "tests.debug.DotEnvFileParserSuite", "tests.SemanticdbScala3Suite",
      "tests.troubleshoot.ProblemResolverSuite")
  )

}